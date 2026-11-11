.class public final Lc6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    new-array v1, v0, [Lrp1;

    .line 7
    .line 8
    iput-object v1, p0, Lc6;->b:Ljava/lang/Object;

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    iput-object v1, p0, Lc6;->c:Ljava/lang/Object;

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    iput-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object v0, Lw54;->a:Lx03;

    .line 19
    .line 20
    new-instance v0, Lx03;

    .line 21
    .line 22
    invoke-direct {v0}, Lx03;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v0, Lx03;

    .line 28
    .line 29
    invoke-direct {v0}, Lx03;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lc6;->f:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 42
    iput v0, p0, Lc6;->a:I

    .line 43
    iput-object p1, p0, Lc6;->b:Ljava/lang/Object;

    .line 44
    invoke-static {}, Lfg;->a()Lfg;

    move-result-object p1

    iput-object p1, p0, Lc6;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgz3;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lc6;->b:Ljava/lang/Object;

    .line 37
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lc6;->c:Ljava/lang/Object;

    .line 38
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lc6;->d:Ljava/lang/Object;

    .line 39
    new-instance p1, Ljava/util/PriorityQueue;

    invoke-direct {p1}, Ljava/util/PriorityQueue;-><init>()V

    iput-object p1, p0, Lc6;->e:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 40
    iput p1, p0, Lc6;->a:I

    return-void
.end method

.method public static f(Landroid/content/Context;I)Lc6;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    const-string v3, "Cannot create a CalendarItemStyle with a styleResId of 0"

    .line 9
    .line 10
    invoke-static {v3, v2}, Ll93;->j(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lht3;->y:[I

    .line 14
    .line 15
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    new-instance v5, Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-direct {v5, v2, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x4

    .line 43
    invoke-static {p0, p1, v0}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/16 v2, 0x9

    .line 48
    .line 49
    invoke-static {p0, p1, v2}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const/4 v3, 0x7

    .line 54
    invoke-static {p0, p1, v3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const/16 v4, 0x8

    .line 59
    .line 60
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/4 v6, 0x5

    .line 65
    invoke-virtual {p1, v6, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    const/4 v7, 0x6

    .line 70
    invoke-virtual {p1, v7, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-static {p0, v6, v1}, Lbc4;->a(Landroid/content/Context;II)Lzc1;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Lzc1;->a()Lbc4;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 83
    .line 84
    .line 85
    new-instance p1, Lc6;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iget v1, v5, Landroid/graphics/Rect;->left:I

    .line 91
    .line 92
    invoke-static {v1}, Ll93;->k(I)V

    .line 93
    .line 94
    .line 95
    iget v1, v5, Landroid/graphics/Rect;->top:I

    .line 96
    .line 97
    invoke-static {v1}, Ll93;->k(I)V

    .line 98
    .line 99
    .line 100
    iget v1, v5, Landroid/graphics/Rect;->right:I

    .line 101
    .line 102
    invoke-static {v1}, Ll93;->k(I)V

    .line 103
    .line 104
    .line 105
    iget v1, v5, Landroid/graphics/Rect;->bottom:I

    .line 106
    .line 107
    invoke-static {v1}, Ll93;->k(I)V

    .line 108
    .line 109
    .line 110
    iput-object v5, p1, Lc6;->b:Ljava/lang/Object;

    .line 111
    .line 112
    iput-object v2, p1, Lc6;->c:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v0, p1, Lc6;->d:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v3, p1, Lc6;->e:Ljava/lang/Object;

    .line 117
    .line 118
    iput v4, p1, Lc6;->a:I

    .line 119
    .line 120
    iput-object p0, p1, Lc6;->f:Ljava/lang/Object;

    .line 121
    .line 122
    return-object p1
.end method


# virtual methods
.method public A(Landroid/widget/TextView;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lc6;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    new-instance v1, Lfi2;

    .line 6
    .line 7
    invoke-direct {v1}, Lfi2;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lfi2;

    .line 11
    .line 12
    invoke-direct {v2}, Lfi2;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v3, p0, Lc6;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Lbc4;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Lc6;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 30
    .line 31
    .line 32
    iget v3, p0, Lc6;->a:I

    .line 33
    .line 34
    int-to-float v3, v3

    .line 35
    iget-object v4, p0, Lc6;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Lfi2;->r(F)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v4}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    .line 49
    .line 50
    const/16 v3, 0x1e

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v6, v0, v1, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 60
    .line 61
    iget-object p0, p0, Lc6;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Landroid/graphics/Rect;

    .line 64
    .line 65
    iget v7, p0, Landroid/graphics/Rect;->left:I

    .line 66
    .line 67
    iget v8, p0, Landroid/graphics/Rect;->top:I

    .line 68
    .line 69
    iget v9, p0, Landroid/graphics/Rect;->right:I

    .line 70
    .line 71
    iget v10, p0, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    invoke-direct/range {v5 .. v10}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 77
    .line 78
    invoke-virtual {p1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public B(II)I
    .locals 9

    .line 1
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljo3;

    .line 4
    .line 5
    iget-object p0, p0, Lc6;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    sub-int/2addr v1, v2

    .line 15
    :goto_0
    const/16 v3, 0x8

    .line 16
    .line 17
    if-ltz v1, :cond_d

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, Lb6;

    .line 24
    .line 25
    iget v5, v4, Lb6;->a:I

    .line 26
    .line 27
    iget v6, v4, Lb6;->b:I

    .line 28
    .line 29
    const/4 v7, 0x2

    .line 30
    if-ne v5, v3, :cond_8

    .line 31
    .line 32
    iget v3, v4, Lb6;->d:I

    .line 33
    .line 34
    if-ge v6, v3, :cond_0

    .line 35
    .line 36
    move v8, v3

    .line 37
    move v5, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v5, v3

    .line 40
    move v8, v6

    .line 41
    :goto_1
    if-lt p1, v5, :cond_6

    .line 42
    .line 43
    if-gt p1, v8, :cond_6

    .line 44
    .line 45
    if-ne v5, v6, :cond_3

    .line 46
    .line 47
    if-ne p2, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    iput v3, v4, Lb6;->d:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    if-ne p2, v7, :cond_2

    .line 55
    .line 56
    add-int/lit8 v3, v3, -0x1

    .line 57
    .line 58
    iput v3, v4, Lb6;->d:I

    .line 59
    .line 60
    :cond_2
    :goto_2
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    if-ne p2, v2, :cond_4

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    iput v6, v4, Lb6;->b:I

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    if-ne p2, v7, :cond_5

    .line 71
    .line 72
    add-int/lit8 v6, v6, -0x1

    .line 73
    .line 74
    iput v6, v4, Lb6;->b:I

    .line 75
    .line 76
    :cond_5
    :goto_3
    add-int/lit8 p1, p1, -0x1

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    if-ge p1, v6, :cond_c

    .line 80
    .line 81
    if-ne p2, v2, :cond_7

    .line 82
    .line 83
    add-int/lit8 v6, v6, 0x1

    .line 84
    .line 85
    iput v6, v4, Lb6;->b:I

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    iput v3, v4, Lb6;->d:I

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    if-ne p2, v7, :cond_c

    .line 93
    .line 94
    add-int/lit8 v6, v6, -0x1

    .line 95
    .line 96
    iput v6, v4, Lb6;->b:I

    .line 97
    .line 98
    add-int/lit8 v3, v3, -0x1

    .line 99
    .line 100
    iput v3, v4, Lb6;->d:I

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_8
    if-gt v6, p1, :cond_a

    .line 104
    .line 105
    if-ne v5, v2, :cond_9

    .line 106
    .line 107
    iget v3, v4, Lb6;->d:I

    .line 108
    .line 109
    sub-int/2addr p1, v3

    .line 110
    goto :goto_4

    .line 111
    :cond_9
    if-ne v5, v7, :cond_c

    .line 112
    .line 113
    iget v3, v4, Lb6;->d:I

    .line 114
    .line 115
    add-int/2addr p1, v3

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-ne p2, v2, :cond_b

    .line 118
    .line 119
    add-int/lit8 v6, v6, 0x1

    .line 120
    .line 121
    iput v6, v4, Lb6;->b:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_b
    if-ne p2, v7, :cond_c

    .line 125
    .line 126
    add-int/lit8 v6, v6, -0x1

    .line 127
    .line 128
    iput v6, v4, Lb6;->b:I

    .line 129
    .line 130
    :cond_c
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    sub-int/2addr p2, v2

    .line 138
    :goto_5
    if-ltz p2, :cond_11

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, Lb6;

    .line 145
    .line 146
    iget v2, v1, Lb6;->a:I

    .line 147
    .line 148
    iget v4, v1, Lb6;->d:I

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    if-ne v2, v3, :cond_f

    .line 152
    .line 153
    iget v2, v1, Lb6;->b:I

    .line 154
    .line 155
    if-eq v4, v2, :cond_e

    .line 156
    .line 157
    if-gez v4, :cond_10

    .line 158
    .line 159
    :cond_e
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    iput-object v5, v1, Lb6;->c:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_f
    if-gtz v4, :cond_10

    .line 169
    .line 170
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    iput-object v5, v1, Lb6;->c:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_10
    :goto_6
    add-int/lit8 p2, p2, -0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_11
    return p1
.end method

.method public C(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p1, p0, Lc6;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lc6;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lu31;

    .line 14
    .line 15
    iget-object p0, p0, Lu31;->o:Li41;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0}, Li41;->z1()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/16 v2, 0xa

    .line 33
    .line 34
    invoke-virtual {p0, v1, v2, p1}, Li41;->q1(IILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-virtual {p0, v1, v2, p1}, Li41;->q1(IILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 42
    .line 43
    new-instance p1, Lij0;

    .line 44
    .line 45
    invoke-direct {p1, v0, v1}, Lij0;-><init>(II)V

    .line 46
    .line 47
    .line 48
    const/16 v0, 0x15

    .line 49
    .line 50
    invoke-virtual {p0, v0, p1}, Ltc2;->f(ILqc2;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public a(JLbe3;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    iget-object v1, p0, Lc6;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/PriorityQueue;

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v2, p1, v2

    .line 15
    .line 16
    if-eqz v2, :cond_6

    .line 17
    .line 18
    iget v3, p0, Lc6;->a:I

    .line 19
    .line 20
    if-eqz v3, :cond_6

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget v5, p0, Lc6;->a:I

    .line 30
    .line 31
    if-lt v3, v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lfz3;

    .line 38
    .line 39
    sget-object v5, Lf35;->a:Ljava/lang/String;

    .line 40
    .line 41
    iget-wide v5, v3, Lfz3;->o:J

    .line 42
    .line 43
    cmp-long v3, p1, v5

    .line 44
    .line 45
    if-gez v3, :cond_0

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    iget-object v3, p0, Lc6;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Ljava/util/ArrayDeque;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    new-instance v3, Lbe3;

    .line 59
    .line 60
    invoke-direct {v3}, Lbe3;-><init>()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lbe3;

    .line 69
    .line 70
    :goto_0
    invoke-virtual {p3}, Lbe3;->a()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v3, v5}, Lbe3;->K(I)V

    .line 75
    .line 76
    .line 77
    iget-object v5, p3, Lbe3;->a:[B

    .line 78
    .line 79
    iget p3, p3, Lbe3;->b:I

    .line 80
    .line 81
    iget-object v6, v3, Lbe3;->a:[B

    .line 82
    .line 83
    invoke-virtual {v3}, Lbe3;->a()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    const/4 v8, 0x0

    .line 88
    invoke-static {v5, p3, v6, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget-object p3, p0, Lc6;->f:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p3, Lfz3;

    .line 94
    .line 95
    if-eqz p3, :cond_2

    .line 96
    .line 97
    iget-wide v5, p3, Lfz3;->o:J

    .line 98
    .line 99
    cmp-long v5, p1, v5

    .line 100
    .line 101
    if-nez v5, :cond_2

    .line 102
    .line 103
    iget-object p0, p3, Lfz3;->n:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-eqz p3, :cond_3

    .line 114
    .line 115
    new-instance p3, Lfz3;

    .line 116
    .line 117
    invoke-direct {p3}, Lfz3;-><init>()V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    check-cast p3, Lfz3;

    .line 126
    .line 127
    :goto_1
    iget-object v0, p3, Lfz3;->n:Ljava/util/ArrayList;

    .line 128
    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    const/4 v8, 0x1

    .line 132
    :cond_4
    invoke-static {v8}, Lrr2;->l(Z)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 140
    .line 141
    .line 142
    iput-wide p1, p3, Lfz3;->o:J

    .line 143
    .line 144
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, p3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    iput-object p3, p0, Lc6;->f:Ljava/lang/Object;

    .line 151
    .line 152
    iget p1, p0, Lc6;->a:I

    .line 153
    .line 154
    if-eq p1, v4, :cond_5

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lc6;->j(I)V

    .line 157
    .line 158
    .line 159
    :cond_5
    return-void

    .line 160
    :cond_6
    :goto_2
    iget-object p0, p0, Lc6;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, Lgz3;

    .line 163
    .line 164
    invoke-interface {p0, p1, p2, p3}, Lgz3;->k(JLbe3;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v2, p0, Lc6;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lla0;

    .line 14
    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    iget-object v2, p0, Lc6;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lla0;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lla0;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lc6;->f:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    iget-object v2, p0, Lc6;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lla0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    iput-object v3, v2, Lla0;->p:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput-boolean v4, v2, Lla0;->o:Z

    .line 39
    .line 40
    iput-object v3, v2, Lla0;->q:Ljava/lang/Object;

    .line 41
    .line 42
    iput-boolean v4, v2, Lla0;->n:Z

    .line 43
    .line 44
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iput-boolean v4, v2, Lla0;->o:Z

    .line 54
    .line 55
    iput-object v3, v2, Lla0;->p:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iput-boolean v4, v2, Lla0;->n:Z

    .line 64
    .line 65
    iput-object v3, v2, Lla0;->q:Ljava/lang/Object;

    .line 66
    .line 67
    :cond_2
    iget-boolean v3, v2, Lla0;->o:Z

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    iget-boolean v3, v2, Lla0;->n:Z

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {v1, v2, p0}, Lfg;->e(Landroid/graphics/drawable/Drawable;Lla0;[I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    iget-object v2, p0, Lc6;->e:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Lla0;

    .line 86
    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v1, v2, p0}, Lfg;->e(Landroid/graphics/drawable/Drawable;Lla0;[I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    iget-object p0, p0, Lc6;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lla0;

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v1, p0, v0}, Lfg;->e(Landroid/graphics/drawable/Drawable;Lla0;[I)V

    .line 108
    .line 109
    .line 110
    :cond_6
    return-void
.end method

.method public c(I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    check-cast v4, Lb6;

    .line 18
    .line 19
    iget v5, v4, Lb6;->a:I

    .line 20
    .line 21
    const/16 v6, 0x8

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    iget v4, v4, Lb6;->d:I

    .line 27
    .line 28
    add-int/lit8 v5, v3, 0x1

    .line 29
    .line 30
    invoke-virtual {p0, v4, v5}, Lc6;->i(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-ne v4, p1, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-ne v5, v7, :cond_2

    .line 38
    .line 39
    iget v5, v4, Lb6;->b:I

    .line 40
    .line 41
    iget v4, v4, Lb6;->d:I

    .line 42
    .line 43
    add-int/2addr v4, v5

    .line 44
    :goto_1
    if-ge v5, v4, :cond_2

    .line 45
    .line 46
    add-int/lit8 v6, v3, 0x1

    .line 47
    .line 48
    invoke-virtual {p0, v5, v6}, Lc6;->i(II)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-ne v6, p1, :cond_1

    .line 53
    .line 54
    :goto_2
    return v7

    .line 55
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    return v2
.end method

.method public d()V
    .locals 6

    .line 1
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_0

    .line 12
    .line 13
    iget-object v4, p0, Lc6;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lsi1;

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, Lb6;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Lsi1;->C(Lb6;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0, v0}, Lc6;->t(Ljava/util/ArrayList;)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lc6;->a:I

    .line 33
    .line 34
    return-void
.end method

.method public e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsi1;

    .line 4
    .line 5
    invoke-virtual {p0}, Lc6;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lc6;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    if-ge v4, v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Lb6;

    .line 25
    .line 26
    iget v6, v5, Lb6;->a:I

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    if-eq v6, v7, :cond_3

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-eq v6, v8, :cond_2

    .line 33
    .line 34
    const/4 v7, 0x4

    .line 35
    if-eq v6, v7, :cond_1

    .line 36
    .line 37
    const/16 v7, 0x8

    .line 38
    .line 39
    if-eq v6, v7, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-virtual {v0, v5}, Lsi1;->C(Lb6;)V

    .line 43
    .line 44
    .line 45
    iget v6, v5, Lb6;->b:I

    .line 46
    .line 47
    iget v5, v5, Lb6;->d:I

    .line 48
    .line 49
    invoke-virtual {v0, v6, v5}, Lsi1;->H(II)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v0, v5}, Lsi1;->C(Lb6;)V

    .line 54
    .line 55
    .line 56
    iget v6, v5, Lb6;->b:I

    .line 57
    .line 58
    iget v7, v5, Lb6;->d:I

    .line 59
    .line 60
    iget-object v5, v5, Lb6;->c:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0, v6, v7, v5}, Lsi1;->F(IILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {v0, v5}, Lsi1;->C(Lb6;)V

    .line 67
    .line 68
    .line 69
    iget v6, v5, Lb6;->b:I

    .line 70
    .line 71
    iget v5, v5, Lb6;->d:I

    .line 72
    .line 73
    iget-object v8, v0, Lsi1;->o:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    invoke-virtual {v8, v6, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 78
    .line 79
    .line 80
    iput-boolean v7, v8, Landroidx/recyclerview/widget/RecyclerView;->x0:Z

    .line 81
    .line 82
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->u0:Lyw3;

    .line 83
    .line 84
    iget v7, v6, Lyw3;->c:I

    .line 85
    .line 86
    add-int/2addr v7, v5

    .line 87
    iput v7, v6, Lyw3;->c:I

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {v0, v5}, Lsi1;->C(Lb6;)V

    .line 91
    .line 92
    .line 93
    iget v6, v5, Lb6;->b:I

    .line 94
    .line 95
    iget v5, v5, Lb6;->d:I

    .line 96
    .line 97
    invoke-virtual {v0, v6, v5}, Lsi1;->G(II)V

    .line 98
    .line 99
    .line 100
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-virtual {p0, v1}, Lc6;->t(Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    iput v3, p0, Lc6;->a:I

    .line 107
    .line 108
    return-void
.end method

.method public g(Lb6;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljo3;

    .line 4
    .line 5
    iget v1, p1, Lb6;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_8

    .line 9
    .line 10
    const/16 v3, 0x8

    .line 11
    .line 12
    if-eq v1, v3, :cond_8

    .line 13
    .line 14
    iget v3, p1, Lb6;->b:I

    .line 15
    .line 16
    invoke-virtual {p0, v3, v1}, Lc6;->B(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v3, p1, Lb6;->b:I

    .line 21
    .line 22
    iget v4, p1, Lb6;->a:I

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    const/4 v6, 0x4

    .line 26
    if-eq v4, v5, :cond_1

    .line 27
    .line 28
    if-ne v4, v6, :cond_0

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "op should be remove or update."

    .line 33
    .line 34
    invoke-static {p1, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const/4 v4, 0x0

    .line 39
    :goto_0
    move v7, v2

    .line 40
    move v8, v7

    .line 41
    :goto_1
    iget v9, p1, Lb6;->d:I

    .line 42
    .line 43
    const/4 v10, 0x0

    .line 44
    if-ge v7, v9, :cond_6

    .line 45
    .line 46
    iget v9, p1, Lb6;->b:I

    .line 47
    .line 48
    mul-int v11, v4, v7

    .line 49
    .line 50
    add-int/2addr v11, v9

    .line 51
    iget v9, p1, Lb6;->a:I

    .line 52
    .line 53
    invoke-virtual {p0, v11, v9}, Lc6;->B(II)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iget v11, p1, Lb6;->a:I

    .line 58
    .line 59
    if-eq v11, v5, :cond_3

    .line 60
    .line 61
    if-eq v11, v6, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    add-int/lit8 v12, v1, 0x1

    .line 65
    .line 66
    if-ne v9, v12, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    if-ne v9, v1, :cond_4

    .line 70
    .line 71
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_3
    iget-object v12, p1, Lb6;->c:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {p0, v12, v11, v1, v8}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p0, v1, v3}, Lc6;->h(Lb6;I)V

    .line 81
    .line 82
    .line 83
    iput-object v10, v1, Lb6;->c:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget v1, p1, Lb6;->a:I

    .line 89
    .line 90
    if-ne v1, v6, :cond_5

    .line 91
    .line 92
    add-int/2addr v3, v8

    .line 93
    :cond_5
    move v8, v2

    .line 94
    move v1, v9

    .line 95
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_6
    iget-object v2, p1, Lb6;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v10, p1, Lb6;->c:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    if-lez v8, :cond_7

    .line 106
    .line 107
    iget p1, p1, Lb6;->a:I

    .line 108
    .line 109
    invoke-virtual {p0, v2, p1, v1, v8}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1, v3}, Lc6;->h(Lb6;I)V

    .line 114
    .line 115
    .line 116
    iput-object v10, p1, Lb6;->c:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_7
    return-void

    .line 122
    :cond_8
    const-string p0, "should not dispatch add or move for pre layout"

    .line 123
    .line 124
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public h(Lb6;I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsi1;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lsi1;->C(Lb6;)V

    .line 6
    .line 7
    .line 8
    iget v0, p1, Lb6;->a:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget v0, p1, Lb6;->d:I

    .line 17
    .line 18
    iget-object p1, p1, Lb6;->c:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p2, v0, p1}, Lsi1;->F(IILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p0, "only remove and update ops can be dispatched in first pass"

    .line 25
    .line 26
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget p1, p1, Lb6;->d:I

    .line 31
    .line 32
    iget-object p0, p0, Lsi1;->o:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p0, p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 38
    .line 39
    .line 40
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Z

    .line 41
    .line 42
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lyw3;

    .line 43
    .line 44
    iget p2, p0, Lyw3;->c:I

    .line 45
    .line 46
    add-int/2addr p2, p1

    .line 47
    iput p2, p0, Lyw3;->c:I

    .line 48
    .line 49
    return-void
.end method

.method public i(II)I
    .locals 5

    .line 1
    iget-object p0, p0, Lc6;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    if-ge p2, v0, :cond_6

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lb6;

    .line 16
    .line 17
    iget v2, v1, Lb6;->a:I

    .line 18
    .line 19
    iget v3, v1, Lb6;->b:I

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-ne v2, v4, :cond_2

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    iget p1, v1, Lb6;->d:I

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-ge v3, p1, :cond_1

    .line 31
    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    :cond_1
    iget v1, v1, Lb6;->d:I

    .line 35
    .line 36
    if-gt v1, p1, :cond_5

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    if-gt v3, p1, :cond_5

    .line 42
    .line 43
    const/4 v4, 0x2

    .line 44
    if-ne v2, v4, :cond_4

    .line 45
    .line 46
    iget v1, v1, Lb6;->d:I

    .line 47
    .line 48
    add-int/2addr v3, v1

    .line 49
    if-ge p1, v3, :cond_3

    .line 50
    .line 51
    const/4 p0, -0x1

    .line 52
    return p0

    .line 53
    :cond_3
    sub-int/2addr p1, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v3, 0x1

    .line 56
    if-ne v2, v3, :cond_5

    .line 57
    .line 58
    iget v1, v1, Lb6;->d:I

    .line 59
    .line 60
    add-int/2addr p1, v1

    .line 61
    :cond_5
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    return p1
.end method

.method public j(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/PriorityQueue;

    .line 4
    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-le v1, p1, :cond_2

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lfz3;

    .line 16
    .line 17
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_1
    iget-object v3, v1, Lfz3;->n:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ge v2, v4, :cond_0

    .line 27
    .line 28
    iget-object v4, p0, Lc6;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Lgz3;

    .line 31
    .line 32
    iget-wide v5, v1, Lfz3;->o:J

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lbe3;

    .line 39
    .line 40
    invoke-interface {v4, v5, v6, v7}, Lgz3;->k(JLbe3;)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, Lc6;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lbe3;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lc6;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lfz3;

    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    iget-wide v2, v2, Lfz3;->o:J

    .line 69
    .line 70
    iget-wide v4, v1, Lfz3;->o:J

    .line 71
    .line 72
    cmp-long v2, v2, v4

    .line 73
    .line 74
    if-nez v2, :cond_1

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    iput-object v2, p0, Lc6;->f:Ljava/lang/Object;

    .line 78
    .line 79
    :cond_1
    iget-object v2, p0, Lc6;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Ljava/util/ArrayDeque;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    return-void
.end method

.method public k()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lla0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lla0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public l()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lla0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lla0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public m()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lc6;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-lez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public n(Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v4, Lst3;->B:[I

    .line 10
    .line 11
    invoke-static {v1, p1, v4, p2}, Ljv3;->f(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ljv3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Ljv3;->o:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v9, v2

    .line 18
    check-cast v9, Landroid/content/res/TypedArray;

    .line 19
    .line 20
    iget-object v2, p0, Lc6;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v5, v1, Ljv3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    check-cast v6, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    move-object v5, p1

    .line 35
    move v7, p2

    .line 36
    invoke-static/range {v2 .. v8}, Lj65;->n(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    :try_start_0
    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    const/4 v2, -0x1

    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v9, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput p1, p0, Lc6;->a:I

    .line 52
    .line 53
    iget-object p1, p0, Lc6;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lfg;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iget v3, p0, Lc6;->a:I

    .line 62
    .line 63
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :try_start_1
    iget-object v4, p1, Lfg;->a:Lc14;

    .line 65
    .line 66
    invoke-virtual {v4, p2, v3}, Lc14;->g(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    :try_start_2
    monitor-exit p1

    .line 71
    if-eqz p2, :cond_0

    .line 72
    .line 73
    invoke-virtual {p0, p2}, Lc6;->w(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object p0, v0

    .line 79
    goto :goto_1

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :try_start_4
    throw p0

    .line 84
    :cond_0
    :goto_0
    const/4 p0, 0x1

    .line 85
    invoke-virtual {v9, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1, p0}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    const/4 p0, 0x2

    .line 99
    invoke-virtual {v9, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_2

    .line 104
    .line 105
    invoke-virtual {v9, p0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    const/4 p1, 0x0

    .line 110
    invoke-static {p0, p1}, Law0;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {v1}, Ljv3;->g()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_1
    invoke-virtual {v1}, Ljv3;->g()V

    .line 122
    .line 123
    .line 124
    throw p0
.end method

.method public o(Ljava/lang/Object;III)Lb6;
    .locals 0

    .line 1
    iget-object p0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljo3;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljo3;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lb6;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Lb6;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput p2, p0, Lb6;->a:I

    .line 19
    .line 20
    iput p3, p0, Lb6;->b:I

    .line 21
    .line 22
    iput p4, p0, Lb6;->d:I

    .line 23
    .line 24
    iput-object p1, p0, Lb6;->c:Ljava/lang/Object;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    iput p2, p0, Lb6;->a:I

    .line 28
    .line 29
    iput p3, p0, Lb6;->b:I

    .line 30
    .line 31
    iput p4, p0, Lb6;->d:I

    .line 32
    .line 33
    iput-object p1, p0, Lb6;->c:Ljava/lang/Object;

    .line 34
    .line 35
    return-object p0
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lc6;->a:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lc6;->w(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lc6;->b()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q(I)V
    .locals 3

    .line 1
    iput p1, p0, Lc6;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lc6;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lfg;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lc6;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Lfg;->a:Lc14;

    .line 19
    .line 20
    invoke-virtual {v2, v1, p1}, Lc14;->g(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Lc6;->w(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lc6;->b()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public r(Lb6;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsi1;

    .line 4
    .line 5
    iget-object p0, p0, Lc6;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget p0, p1, Lb6;->a:I

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p0, v2, :cond_2

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-eq p0, v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x8

    .line 24
    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    iget p0, p1, Lb6;->b:I

    .line 28
    .line 29
    iget p1, p1, Lb6;->d:I

    .line 30
    .line 31
    invoke-virtual {v0, p0, p1}, Lsi1;->H(II)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "Unknown update op type for "

    .line 36
    .line 37
    invoke-static {p1, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    iget p0, p1, Lb6;->b:I

    .line 42
    .line 43
    iget v1, p1, Lb6;->d:I

    .line 44
    .line 45
    iget-object p1, p1, Lb6;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v0, p0, v1, p1}, Lsi1;->F(IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget p0, p1, Lb6;->b:I

    .line 52
    .line 53
    iget p1, p1, Lb6;->d:I

    .line 54
    .line 55
    iget-object v0, v0, Lsi1;->o:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0, p0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->U(IIZ)V

    .line 61
    .line 62
    .line 63
    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->x0:Z

    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget p0, p1, Lb6;->b:I

    .line 67
    .line 68
    iget p1, p1, Lb6;->d:I

    .line 69
    .line 70
    invoke-virtual {v0, p0, p1}, Lsi1;->G(II)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public s()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lc6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljo3;

    .line 6
    .line 7
    iget-object v2, v0, Lc6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lsi1;

    .line 10
    .line 11
    iget-object v3, v0, Lc6;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lpz1;

    .line 14
    .line 15
    iget-object v4, v0, Lc6;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x1

    .line 27
    sub-int/2addr v5, v6

    .line 28
    const/4 v8, 0x0

    .line 29
    :goto_1
    const/16 v9, 0x8

    .line 30
    .line 31
    const/4 v10, -0x1

    .line 32
    if-ltz v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v11

    .line 38
    check-cast v11, Lb6;

    .line 39
    .line 40
    iget v11, v11, Lb6;->a:I

    .line 41
    .line 42
    if-ne v11, v9, :cond_1

    .line 43
    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    move v8, v6

    .line 48
    :cond_2
    add-int/lit8 v5, v5, -0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    move v5, v10

    .line 52
    :goto_2
    const/4 v11, 0x2

    .line 53
    const/4 v12, 0x4

    .line 54
    if-eq v5, v10, :cond_22

    .line 55
    .line 56
    add-int/lit8 v9, v5, 0x1

    .line 57
    .line 58
    iget-object v13, v3, Lpz1;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v13, Lc6;

    .line 61
    .line 62
    iget-object v14, v13, Lc6;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v14, Ljo3;

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v15

    .line 70
    check-cast v15, Lb6;

    .line 71
    .line 72
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v16

    .line 76
    move-object/from16 v7, v16

    .line 77
    .line 78
    check-cast v7, Lb6;

    .line 79
    .line 80
    iget v10, v7, Lb6;->a:I

    .line 81
    .line 82
    if-eq v10, v6, :cond_1d

    .line 83
    .line 84
    if-eq v10, v11, :cond_b

    .line 85
    .line 86
    if-eq v10, v12, :cond_4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget v10, v15, Lb6;->d:I

    .line 90
    .line 91
    iget v11, v7, Lb6;->b:I

    .line 92
    .line 93
    if-ge v10, v11, :cond_5

    .line 94
    .line 95
    add-int/lit8 v11, v11, -0x1

    .line 96
    .line 97
    iput v11, v7, Lb6;->b:I

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    iget v8, v7, Lb6;->d:I

    .line 101
    .line 102
    add-int/2addr v11, v8

    .line 103
    if-ge v10, v11, :cond_6

    .line 104
    .line 105
    add-int/lit8 v8, v8, -0x1

    .line 106
    .line 107
    iput v8, v7, Lb6;->d:I

    .line 108
    .line 109
    iget v8, v15, Lb6;->b:I

    .line 110
    .line 111
    iget-object v10, v7, Lb6;->c:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {v13, v10, v12, v8, v6}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    :goto_3
    const/4 v6, 0x0

    .line 119
    :goto_4
    iget v8, v15, Lb6;->b:I

    .line 120
    .line 121
    iget v10, v7, Lb6;->b:I

    .line 122
    .line 123
    if-gt v8, v10, :cond_7

    .line 124
    .line 125
    add-int/lit8 v10, v10, 0x1

    .line 126
    .line 127
    iput v10, v7, Lb6;->b:I

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_7
    iget v11, v7, Lb6;->d:I

    .line 131
    .line 132
    add-int/2addr v10, v11

    .line 133
    if-ge v8, v10, :cond_8

    .line 134
    .line 135
    sub-int/2addr v10, v8

    .line 136
    add-int/lit8 v8, v8, 0x1

    .line 137
    .line 138
    iget-object v11, v7, Lb6;->c:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v13, v11, v12, v8, v10}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    iget v11, v7, Lb6;->d:I

    .line 145
    .line 146
    sub-int/2addr v11, v10

    .line 147
    iput v11, v7, Lb6;->d:I

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_8
    :goto_5
    const/4 v8, 0x0

    .line 151
    :goto_6
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    iget v9, v7, Lb6;->d:I

    .line 155
    .line 156
    if-lez v9, :cond_9

    .line 157
    .line 158
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_9
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    const/4 v9, 0x0

    .line 166
    iput-object v9, v7, Lb6;->c:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-virtual {v14, v7}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :goto_7
    if-eqz v6, :cond_a

    .line 172
    .line 173
    invoke-virtual {v4, v5, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    if-eqz v8, :cond_0

    .line 177
    .line 178
    invoke-virtual {v4, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_b
    iget v8, v15, Lb6;->b:I

    .line 184
    .line 185
    iget v10, v15, Lb6;->d:I

    .line 186
    .line 187
    iget v12, v7, Lb6;->b:I

    .line 188
    .line 189
    if-ge v8, v10, :cond_d

    .line 190
    .line 191
    if-ne v12, v8, :cond_c

    .line 192
    .line 193
    iget v6, v7, Lb6;->d:I

    .line 194
    .line 195
    sub-int v8, v10, v8

    .line 196
    .line 197
    if-ne v6, v8, :cond_c

    .line 198
    .line 199
    const/4 v6, 0x0

    .line 200
    :goto_8
    const/16 v17, 0x1

    .line 201
    .line 202
    goto :goto_a

    .line 203
    :cond_c
    const/4 v6, 0x0

    .line 204
    :goto_9
    const/16 v17, 0x0

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_d
    add-int/lit8 v6, v10, 0x1

    .line 208
    .line 209
    if-ne v12, v6, :cond_e

    .line 210
    .line 211
    iget v6, v7, Lb6;->d:I

    .line 212
    .line 213
    sub-int/2addr v8, v10

    .line 214
    if-ne v6, v8, :cond_e

    .line 215
    .line 216
    const/4 v6, 0x1

    .line 217
    goto :goto_8

    .line 218
    :cond_e
    const/4 v6, 0x1

    .line 219
    goto :goto_9

    .line 220
    :goto_a
    if-ge v10, v12, :cond_f

    .line 221
    .line 222
    add-int/lit8 v12, v12, -0x1

    .line 223
    .line 224
    iput v12, v7, Lb6;->b:I

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_f
    iget v8, v7, Lb6;->d:I

    .line 228
    .line 229
    add-int/2addr v12, v8

    .line 230
    if-ge v10, v12, :cond_10

    .line 231
    .line 232
    add-int/lit8 v8, v8, -0x1

    .line 233
    .line 234
    iput v8, v7, Lb6;->d:I

    .line 235
    .line 236
    iput v11, v15, Lb6;->a:I

    .line 237
    .line 238
    const/4 v5, 0x1

    .line 239
    iput v5, v15, Lb6;->d:I

    .line 240
    .line 241
    iget v5, v7, Lb6;->d:I

    .line 242
    .line 243
    if-nez v5, :cond_0

    .line 244
    .line 245
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    const/4 v9, 0x0

    .line 249
    iput-object v9, v7, Lb6;->c:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v14, v7}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_10
    :goto_b
    iget v8, v15, Lb6;->b:I

    .line 257
    .line 258
    iget v10, v7, Lb6;->b:I

    .line 259
    .line 260
    if-gt v8, v10, :cond_12

    .line 261
    .line 262
    add-int/lit8 v10, v10, 0x1

    .line 263
    .line 264
    iput v10, v7, Lb6;->b:I

    .line 265
    .line 266
    :cond_11
    const/4 v12, 0x0

    .line 267
    goto :goto_c

    .line 268
    :cond_12
    iget v12, v7, Lb6;->d:I

    .line 269
    .line 270
    add-int/2addr v10, v12

    .line 271
    if-ge v8, v10, :cond_11

    .line 272
    .line 273
    sub-int/2addr v10, v8

    .line 274
    add-int/lit8 v8, v8, 0x1

    .line 275
    .line 276
    const/4 v12, 0x0

    .line 277
    invoke-virtual {v13, v12, v11, v8, v10}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 278
    .line 279
    .line 280
    move-result-object v18

    .line 281
    iget v8, v15, Lb6;->b:I

    .line 282
    .line 283
    iget v10, v7, Lb6;->b:I

    .line 284
    .line 285
    sub-int/2addr v8, v10

    .line 286
    iput v8, v7, Lb6;->d:I

    .line 287
    .line 288
    move-object/from16 v8, v18

    .line 289
    .line 290
    goto :goto_d

    .line 291
    :goto_c
    move-object v8, v12

    .line 292
    :goto_d
    if-eqz v17, :cond_13

    .line 293
    .line 294
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    iput-object v12, v15, Lb6;->c:Ljava/lang/Object;

    .line 301
    .line 302
    invoke-virtual {v14, v15}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_13
    if-eqz v6, :cond_17

    .line 308
    .line 309
    if-eqz v8, :cond_15

    .line 310
    .line 311
    iget v6, v15, Lb6;->b:I

    .line 312
    .line 313
    iget v10, v8, Lb6;->b:I

    .line 314
    .line 315
    if-le v6, v10, :cond_14

    .line 316
    .line 317
    iget v10, v8, Lb6;->d:I

    .line 318
    .line 319
    sub-int/2addr v6, v10

    .line 320
    iput v6, v15, Lb6;->b:I

    .line 321
    .line 322
    :cond_14
    iget v6, v15, Lb6;->d:I

    .line 323
    .line 324
    iget v10, v8, Lb6;->b:I

    .line 325
    .line 326
    if-le v6, v10, :cond_15

    .line 327
    .line 328
    iget v10, v8, Lb6;->d:I

    .line 329
    .line 330
    sub-int/2addr v6, v10

    .line 331
    iput v6, v15, Lb6;->d:I

    .line 332
    .line 333
    :cond_15
    iget v6, v15, Lb6;->b:I

    .line 334
    .line 335
    iget v10, v7, Lb6;->b:I

    .line 336
    .line 337
    if-le v6, v10, :cond_16

    .line 338
    .line 339
    iget v10, v7, Lb6;->d:I

    .line 340
    .line 341
    sub-int/2addr v6, v10

    .line 342
    iput v6, v15, Lb6;->b:I

    .line 343
    .line 344
    :cond_16
    iget v6, v15, Lb6;->d:I

    .line 345
    .line 346
    iget v10, v7, Lb6;->b:I

    .line 347
    .line 348
    if-le v6, v10, :cond_1b

    .line 349
    .line 350
    iget v10, v7, Lb6;->d:I

    .line 351
    .line 352
    sub-int/2addr v6, v10

    .line 353
    iput v6, v15, Lb6;->d:I

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_17
    if-eqz v8, :cond_19

    .line 357
    .line 358
    iget v6, v15, Lb6;->b:I

    .line 359
    .line 360
    iget v10, v8, Lb6;->b:I

    .line 361
    .line 362
    if-lt v6, v10, :cond_18

    .line 363
    .line 364
    iget v10, v8, Lb6;->d:I

    .line 365
    .line 366
    sub-int/2addr v6, v10

    .line 367
    iput v6, v15, Lb6;->b:I

    .line 368
    .line 369
    :cond_18
    iget v6, v15, Lb6;->d:I

    .line 370
    .line 371
    iget v10, v8, Lb6;->b:I

    .line 372
    .line 373
    if-lt v6, v10, :cond_19

    .line 374
    .line 375
    iget v10, v8, Lb6;->d:I

    .line 376
    .line 377
    sub-int/2addr v6, v10

    .line 378
    iput v6, v15, Lb6;->d:I

    .line 379
    .line 380
    :cond_19
    iget v6, v15, Lb6;->b:I

    .line 381
    .line 382
    iget v10, v7, Lb6;->b:I

    .line 383
    .line 384
    if-lt v6, v10, :cond_1a

    .line 385
    .line 386
    iget v10, v7, Lb6;->d:I

    .line 387
    .line 388
    sub-int/2addr v6, v10

    .line 389
    iput v6, v15, Lb6;->b:I

    .line 390
    .line 391
    :cond_1a
    iget v6, v15, Lb6;->d:I

    .line 392
    .line 393
    iget v10, v7, Lb6;->b:I

    .line 394
    .line 395
    if-lt v6, v10, :cond_1b

    .line 396
    .line 397
    iget v10, v7, Lb6;->d:I

    .line 398
    .line 399
    sub-int/2addr v6, v10

    .line 400
    iput v6, v15, Lb6;->d:I

    .line 401
    .line 402
    :cond_1b
    :goto_e
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    iget v6, v15, Lb6;->b:I

    .line 406
    .line 407
    iget v7, v15, Lb6;->d:I

    .line 408
    .line 409
    if-eq v6, v7, :cond_1c

    .line 410
    .line 411
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    goto :goto_f

    .line 415
    :cond_1c
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    :goto_f
    if-eqz v8, :cond_0

    .line 419
    .line 420
    invoke-virtual {v4, v5, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    goto/16 :goto_0

    .line 424
    .line 425
    :cond_1d
    iget v6, v15, Lb6;->d:I

    .line 426
    .line 427
    iget v8, v7, Lb6;->b:I

    .line 428
    .line 429
    if-ge v6, v8, :cond_1e

    .line 430
    .line 431
    const/16 v16, -0x1

    .line 432
    .line 433
    goto :goto_10

    .line 434
    :cond_1e
    const/16 v16, 0x0

    .line 435
    .line 436
    :goto_10
    iget v10, v15, Lb6;->b:I

    .line 437
    .line 438
    if-ge v10, v8, :cond_1f

    .line 439
    .line 440
    add-int/lit8 v16, v16, 0x1

    .line 441
    .line 442
    :cond_1f
    if-gt v8, v10, :cond_20

    .line 443
    .line 444
    iget v8, v7, Lb6;->d:I

    .line 445
    .line 446
    add-int/2addr v10, v8

    .line 447
    iput v10, v15, Lb6;->b:I

    .line 448
    .line 449
    :cond_20
    iget v8, v7, Lb6;->b:I

    .line 450
    .line 451
    if-gt v8, v6, :cond_21

    .line 452
    .line 453
    iget v10, v7, Lb6;->d:I

    .line 454
    .line 455
    add-int/2addr v6, v10

    .line 456
    iput v6, v15, Lb6;->d:I

    .line 457
    .line 458
    :cond_21
    add-int v8, v8, v16

    .line 459
    .line 460
    iput v8, v7, Lb6;->b:I

    .line 461
    .line 462
    invoke-virtual {v4, v5, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v4, v9, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    const/4 v5, 0x0

    .line 475
    :goto_11
    if-ge v5, v3, :cond_36

    .line 476
    .line 477
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    check-cast v6, Lb6;

    .line 482
    .line 483
    iget v7, v6, Lb6;->a:I

    .line 484
    .line 485
    const/4 v8, 0x1

    .line 486
    if-eq v7, v8, :cond_35

    .line 487
    .line 488
    if-eq v7, v11, :cond_2c

    .line 489
    .line 490
    if-eq v7, v12, :cond_24

    .line 491
    .line 492
    if-eq v7, v9, :cond_23

    .line 493
    .line 494
    :goto_12
    const/4 v15, 0x0

    .line 495
    const/16 v19, 0x1

    .line 496
    .line 497
    goto/16 :goto_1e

    .line 498
    .line 499
    :cond_23
    invoke-virtual {v0, v6}, Lc6;->r(Lb6;)V

    .line 500
    .line 501
    .line 502
    goto :goto_12

    .line 503
    :cond_24
    iget v7, v6, Lb6;->b:I

    .line 504
    .line 505
    iget v8, v6, Lb6;->d:I

    .line 506
    .line 507
    add-int/2addr v8, v7

    .line 508
    move v10, v7

    .line 509
    const/4 v13, 0x0

    .line 510
    const/4 v14, -0x1

    .line 511
    :goto_13
    if-ge v7, v8, :cond_29

    .line 512
    .line 513
    invoke-virtual {v2, v7}, Lsi1;->D(I)Lcx3;

    .line 514
    .line 515
    .line 516
    move-result-object v15

    .line 517
    if-nez v15, :cond_27

    .line 518
    .line 519
    invoke-virtual {v0, v7}, Lc6;->c(I)Z

    .line 520
    .line 521
    .line 522
    move-result v15

    .line 523
    if-eqz v15, :cond_25

    .line 524
    .line 525
    goto :goto_15

    .line 526
    :cond_25
    const/4 v15, 0x1

    .line 527
    if-ne v14, v15, :cond_26

    .line 528
    .line 529
    iget-object v14, v6, Lb6;->c:Ljava/lang/Object;

    .line 530
    .line 531
    invoke-virtual {v0, v14, v12, v10, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    invoke-virtual {v0, v10}, Lc6;->r(Lb6;)V

    .line 536
    .line 537
    .line 538
    move v10, v7

    .line 539
    const/4 v13, 0x0

    .line 540
    :cond_26
    const/4 v14, 0x0

    .line 541
    :goto_14
    const/16 v19, 0x1

    .line 542
    .line 543
    goto :goto_16

    .line 544
    :cond_27
    :goto_15
    if-nez v14, :cond_28

    .line 545
    .line 546
    iget-object v14, v6, Lb6;->c:Ljava/lang/Object;

    .line 547
    .line 548
    invoke-virtual {v0, v14, v12, v10, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    invoke-virtual {v0, v10}, Lc6;->g(Lb6;)V

    .line 553
    .line 554
    .line 555
    move v10, v7

    .line 556
    const/4 v13, 0x0

    .line 557
    :cond_28
    const/4 v14, 0x1

    .line 558
    goto :goto_14

    .line 559
    :goto_16
    add-int/lit8 v13, v13, 0x1

    .line 560
    .line 561
    add-int/lit8 v7, v7, 0x1

    .line 562
    .line 563
    goto :goto_13

    .line 564
    :cond_29
    iget v7, v6, Lb6;->d:I

    .line 565
    .line 566
    if-eq v13, v7, :cond_2a

    .line 567
    .line 568
    iget-object v7, v6, Lb6;->c:Ljava/lang/Object;

    .line 569
    .line 570
    const/4 v8, 0x0

    .line 571
    iput-object v8, v6, Lb6;->c:Ljava/lang/Object;

    .line 572
    .line 573
    invoke-virtual {v1, v6}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0, v7, v12, v10, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    :cond_2a
    if-nez v14, :cond_2b

    .line 581
    .line 582
    invoke-virtual {v0, v6}, Lc6;->g(Lb6;)V

    .line 583
    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_2b
    invoke-virtual {v0, v6}, Lc6;->r(Lb6;)V

    .line 587
    .line 588
    .line 589
    goto :goto_12

    .line 590
    :cond_2c
    iget v7, v6, Lb6;->b:I

    .line 591
    .line 592
    iget v8, v6, Lb6;->d:I

    .line 593
    .line 594
    add-int/2addr v8, v7

    .line 595
    move v10, v7

    .line 596
    const/4 v13, 0x0

    .line 597
    const/4 v14, -0x1

    .line 598
    :goto_17
    if-ge v10, v8, :cond_32

    .line 599
    .line 600
    invoke-virtual {v2, v10}, Lsi1;->D(I)Lcx3;

    .line 601
    .line 602
    .line 603
    move-result-object v15

    .line 604
    if-nez v15, :cond_2d

    .line 605
    .line 606
    invoke-virtual {v0, v10}, Lc6;->c(I)Z

    .line 607
    .line 608
    .line 609
    move-result v15

    .line 610
    if-eqz v15, :cond_2e

    .line 611
    .line 612
    :cond_2d
    const/4 v15, 0x0

    .line 613
    goto :goto_19

    .line 614
    :cond_2e
    const/4 v15, 0x1

    .line 615
    if-ne v14, v15, :cond_2f

    .line 616
    .line 617
    const/4 v15, 0x0

    .line 618
    invoke-virtual {v0, v15, v11, v7, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 619
    .line 620
    .line 621
    move-result-object v14

    .line 622
    invoke-virtual {v0, v14}, Lc6;->r(Lb6;)V

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x1

    .line 626
    goto :goto_18

    .line 627
    :cond_2f
    const/4 v15, 0x0

    .line 628
    const/4 v14, 0x0

    .line 629
    :goto_18
    const/4 v15, 0x0

    .line 630
    goto :goto_1b

    .line 631
    :goto_19
    if-nez v14, :cond_30

    .line 632
    .line 633
    invoke-virtual {v0, v15, v11, v7, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 634
    .line 635
    .line 636
    move-result-object v14

    .line 637
    invoke-virtual {v0, v14}, Lc6;->g(Lb6;)V

    .line 638
    .line 639
    .line 640
    const/4 v14, 0x1

    .line 641
    goto :goto_1a

    .line 642
    :cond_30
    const/4 v14, 0x0

    .line 643
    :goto_1a
    const/4 v15, 0x1

    .line 644
    :goto_1b
    if-eqz v14, :cond_31

    .line 645
    .line 646
    sub-int/2addr v10, v13

    .line 647
    sub-int/2addr v8, v13

    .line 648
    const/4 v13, 0x1

    .line 649
    :goto_1c
    const/16 v19, 0x1

    .line 650
    .line 651
    goto :goto_1d

    .line 652
    :cond_31
    add-int/lit8 v13, v13, 0x1

    .line 653
    .line 654
    goto :goto_1c

    .line 655
    :goto_1d
    add-int/lit8 v10, v10, 0x1

    .line 656
    .line 657
    move v14, v15

    .line 658
    goto :goto_17

    .line 659
    :cond_32
    const/16 v19, 0x1

    .line 660
    .line 661
    iget v8, v6, Lb6;->d:I

    .line 662
    .line 663
    const/4 v15, 0x0

    .line 664
    if-eq v13, v8, :cond_33

    .line 665
    .line 666
    iput-object v15, v6, Lb6;->c:Ljava/lang/Object;

    .line 667
    .line 668
    invoke-virtual {v1, v6}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    invoke-virtual {v0, v15, v11, v7, v13}, Lc6;->o(Ljava/lang/Object;III)Lb6;

    .line 672
    .line 673
    .line 674
    move-result-object v6

    .line 675
    :cond_33
    if-nez v14, :cond_34

    .line 676
    .line 677
    invoke-virtual {v0, v6}, Lc6;->g(Lb6;)V

    .line 678
    .line 679
    .line 680
    goto :goto_1e

    .line 681
    :cond_34
    invoke-virtual {v0, v6}, Lc6;->r(Lb6;)V

    .line 682
    .line 683
    .line 684
    goto :goto_1e

    .line 685
    :cond_35
    move/from16 v19, v8

    .line 686
    .line 687
    const/4 v15, 0x0

    .line 688
    invoke-virtual {v0, v6}, Lc6;->r(Lb6;)V

    .line 689
    .line 690
    .line 691
    :goto_1e
    add-int/lit8 v5, v5, 0x1

    .line 692
    .line 693
    goto/16 :goto_11

    .line 694
    .line 695
    :cond_36
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 696
    .line 697
    .line 698
    return-void
.end method

.method public t(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lb6;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    iput-object v3, v2, Lb6;->c:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v3, p0, Lc6;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljo3;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljo3;->a(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public u(Lrp1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Lrp1;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lti;->m0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, [Lrp1;

    .line 14
    .line 15
    add-int/lit8 v1, p1, 0x1

    .line 16
    .line 17
    iget v2, p0, Lc6;->a:I

    .line 18
    .line 19
    invoke-static {p1, v1, v2, v0, v0}, Lti;->Z(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lc6;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [Lrp1;

    .line 25
    .line 26
    iget v2, p0, Lc6;->a:I

    .line 27
    .line 28
    add-int/lit8 v3, v2, -0x1

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    aput-object v4, v0, v3

    .line 32
    .line 33
    iget-object v0, p0, Lc6;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [F

    .line 36
    .line 37
    sub-int/2addr v2, v1

    .line 38
    invoke-static {v0, v1, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, [B

    .line 44
    .line 45
    iget v2, p0, Lc6;->a:I

    .line 46
    .line 47
    invoke-static {p1, v1, v2, v0, v0}, Lti;->X(III[B[B)V

    .line 48
    .line 49
    .line 50
    iget p1, p0, Lc6;->a:I

    .line 51
    .line 52
    add-int/lit8 p1, p1, -0x1

    .line 53
    .line 54
    iput p1, p0, Lc6;->a:I

    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public v(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lc6;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyp4;

    .line 4
    .line 5
    iget-object v0, p0, Lyp4;->a:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public w(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lla0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lla0;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lc6;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lla0;

    .line 19
    .line 20
    iput-object p1, v0, Lla0;->p:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, v0, Lla0;->o:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lc6;->d:Ljava/lang/Object;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Lc6;->b()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lc6;->a:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lc6;->j(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public y(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lla0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lla0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lla0;

    .line 17
    .line 18
    iput-object p1, v0, Lla0;->p:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Lla0;->o:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lc6;->b()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public z(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lla0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lla0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lc6;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lla0;

    .line 17
    .line 18
    iput-object p1, v0, Lla0;->q:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Lla0;->n:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lc6;->b()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
