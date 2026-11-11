.class public Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;
.super Lcom/google/android/material/button/MaterialButton;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lce0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;
    }
.end annotation


# static fields
.field public static final V:Lr00;

.field public static final W:Lr00;

.field public static final a0:Lr00;

.field public static final b0:Lr00;


# instance fields
.field public G:I

.field public final H:Lc51;

.field public final I:Lc51;

.field public final J:Le51;

.field public final K:Ld51;

.field public final L:I

.field public M:I

.field public N:I

.field public final O:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Landroid/content/res/ColorStateList;

.field public T:I

.field public U:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lr00;

    .line 2
    .line 3
    const-string v1, "width"

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-class v3, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->V:Lr00;

    .line 13
    .line 14
    new-instance v0, Lr00;

    .line 15
    .line 16
    const-string v1, "height"

    .line 17
    .line 18
    const/16 v2, 0x9

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->W:Lr00;

    .line 24
    .line 25
    new-instance v0, Lr00;

    .line 26
    .line 27
    const-string v1, "paddingStart"

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-direct {v0, v3, v1, v2}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->a0:Lr00;

    .line 35
    .line 36
    new-instance v0, Lr00;

    .line 37
    .line 38
    const-string v1, "paddingEnd"

    .line 39
    .line 40
    const/16 v2, 0xb

    .line 41
    .line 42
    invoke-direct {v0, v3, v1, v2}, Lr00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->b0:Lr00;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 213
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0401fd

    .line 212
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    const v7, 0x7f140496

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    invoke-static {v1, v2, v4, v7}, Lsu3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v2, v4}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    iput v8, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->G:I

    .line 21
    .line 22
    new-instance v1, Ld34;

    .line 23
    .line 24
    const/4 v9, 0x6

    .line 25
    invoke-direct {v1, v9, v8}, Ld34;-><init>(IZ)V

    .line 26
    .line 27
    .line 28
    new-instance v10, Le51;

    .line 29
    .line 30
    invoke-direct {v10, v0, v1}, Le51;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ld34;)V

    .line 31
    .line 32
    .line 33
    iput-object v10, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->J:Le51;

    .line 34
    .line 35
    new-instance v11, Ld51;

    .line 36
    .line 37
    invoke-direct {v11, v0, v1}, Ld51;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ld34;)V

    .line 38
    .line 39
    .line 40
    iput-object v11, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->K:Ld51;

    .line 41
    .line 42
    const/4 v12, 0x1

    .line 43
    iput-boolean v12, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 44
    .line 45
    iput-boolean v8, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->Q:Z

    .line 46
    .line 47
    iput-boolean v8, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->R:Z

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v3, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;

    .line 54
    .line 55
    invoke-direct {v3, v1, v2}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    .line 57
    .line 58
    iput-object v3, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->O:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;

    .line 59
    .line 60
    const v5, 0x7f140496

    .line 61
    .line 62
    .line 63
    new-array v6, v8, [I

    .line 64
    .line 65
    sget-object v3, Lht3;->m:[I

    .line 66
    .line 67
    invoke-static/range {v1 .. v6}, Luc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const/4 v5, 0x5

    .line 72
    invoke-static {v1, v3, v5}, Lzx2;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lzx2;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const/4 v13, 0x4

    .line 77
    invoke-static {v1, v3, v13}, Lzx2;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lzx2;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    const/4 v14, 0x2

    .line 82
    invoke-static {v1, v3, v14}, Lzx2;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lzx2;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    invoke-static {v1, v3, v9}, Lzx2;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Lzx2;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    const/4 v14, -0x1

    .line 91
    invoke-virtual {v3, v8, v14}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    iput v14, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->L:I

    .line 96
    .line 97
    const/4 v14, 0x3

    .line 98
    invoke-virtual {v3, v14, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    sget-object v16, Lj65;->a:Ljava/util/WeakHashMap;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 105
    .line 106
    .line 107
    move-result v12

    .line 108
    iput v12, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->M:I

    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    iput v12, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->N:I

    .line 115
    .line 116
    new-instance v12, Ld34;

    .line 117
    .line 118
    invoke-direct {v12, v9, v8}, Ld34;-><init>(IZ)V

    .line 119
    .line 120
    .line 121
    new-instance v9, Lc51;

    .line 122
    .line 123
    new-instance v8, Lhg3;

    .line 124
    .line 125
    const/16 v5, 0x11

    .line 126
    .line 127
    invoke-direct {v8, v5, v0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v5, Lrm3;

    .line 131
    .line 132
    invoke-direct {v5, v0, v8}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v17, v3

    .line 136
    .line 137
    new-instance v3, Lr20;

    .line 138
    .line 139
    move-object/from16 v18, v1

    .line 140
    .line 141
    const/4 v1, 0x5

    .line 142
    invoke-direct {v3, v0, v5, v8, v1}, Lr20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 143
    .line 144
    .line 145
    const/4 v1, 0x1

    .line 146
    if-eq v14, v1, :cond_1

    .line 147
    .line 148
    const/4 v1, 0x2

    .line 149
    if-eq v14, v1, :cond_0

    .line 150
    .line 151
    move-object v8, v3

    .line 152
    :goto_0
    const/4 v1, 0x1

    .line 153
    goto :goto_1

    .line 154
    :cond_0
    move-object v8, v5

    .line 155
    goto :goto_0

    .line 156
    :cond_1
    :goto_1
    invoke-direct {v9, v0, v12, v8, v1}, Lc51;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ld34;Lf51;Z)V

    .line 157
    .line 158
    .line 159
    iput-object v9, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->I:Lc51;

    .line 160
    .line 161
    new-instance v1, Lc51;

    .line 162
    .line 163
    new-instance v3, Lzh0;

    .line 164
    .line 165
    const/16 v5, 0x17

    .line 166
    .line 167
    invoke-direct {v3, v5, v0}, Lzh0;-><init>(ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    invoke-direct {v1, v0, v12, v3, v5}, Lc51;-><init>(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;Ld34;Lf51;Z)V

    .line 172
    .line 173
    .line 174
    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 175
    .line 176
    iput-object v6, v10, Ldq;->f:Lzx2;

    .line 177
    .line 178
    iput-object v13, v11, Ldq;->f:Lzx2;

    .line 179
    .line 180
    iput-object v15, v9, Ldq;->f:Lzx2;

    .line 181
    .line 182
    iput-object v7, v1, Ldq;->f:Lzx2;

    .line 183
    .line 184
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    .line 185
    .line 186
    .line 187
    sget-object v1, Lbc4;->m:Loy3;

    .line 188
    .line 189
    move-object/from16 v3, v18

    .line 190
    .line 191
    const v5, 0x7f140496

    .line 192
    .line 193
    .line 194
    invoke-static {v3, v2, v4, v5, v1}, Lbc4;->d(Landroid/content/Context;Landroid/util/AttributeSet;IILke0;)Lzc1;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1}, Lzc1;->a()Lbc4;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setShapeAppearanceModel(Lbc4;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object v1, v0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->S:Landroid/content/res/ColorStateList;

    .line 210
    .line 211
    return-void
.end method

.method public static e(Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    if-eq p1, v1, :cond_2

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-ne p1, v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->I:Lc51;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Unknown strategy type: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->K:Ld51;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->J:Le51;

    .line 32
    .line 33
    :goto_0
    invoke-virtual {v2}, Ldq;->h()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    return-void

    .line 40
    :cond_4
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_7

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget v4, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->G:I

    .line 53
    .line 54
    if-eqz v3, :cond_5

    .line 55
    .line 56
    if-ne v4, v0, :cond_6

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_5
    if-eq v4, v1, :cond_6

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_6
    iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->R:Z

    .line 63
    .line 64
    if-eqz v1, :cond_b

    .line 65
    .line 66
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_b

    .line 71
    .line 72
    if-ne p1, v0, :cond_9

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_8

    .line 79
    .line 80
    iget v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 81
    .line 82
    iput v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->T:I

    .line 83
    .line 84
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 85
    .line 86
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->T:I

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->U:I

    .line 100
    .line 101
    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 102
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->measure(II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ldq;->a()Landroid/animation/AnimatorSet;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance v0, Ll4;

    .line 110
    .line 111
    const/4 v1, 0x6

    .line 112
    invoke-direct {v0, v1, v2}, Ll4;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v2, Ldq;->c:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    :goto_2
    if-ge p1, v1, :cond_a

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    add-int/lit8 p1, p1, 0x1

    .line 131
    .line 132
    check-cast v2, Landroid/animation/Animator$AnimatorListener;

    .line 133
    .line 134
    invoke-virtual {p0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_a
    invoke-virtual {p0}, Landroid/animation/Animator;->start()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_b
    :goto_3
    invoke-virtual {v2}, Ldq;->g()V

    .line 143
    .line 144
    .line 145
    return-void
.end method


# virtual methods
.method public final f(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public getBehavior()Lde0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lde0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->O:Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCollapsedPadding()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->getCollapsedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getIconSize()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-int/2addr v0, p0

    .line 10
    div-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    return v0
.end method

.method public getCollapsedSize()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->L:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    mul-int/lit8 v0, v0, 0x2

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getIconSize()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/2addr p0, v0

    .line 26
    return p0

    .line 27
    :cond_0
    return v0
.end method

.method public getExtendMotionSpec()Lzx2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->I:Lc51;

    .line 2
    .line 3
    iget-object p0, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-object p0
.end method

.method public getHideMotionSpec()Lzx2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->K:Ld51;

    .line 2
    .line 3
    iget-object p0, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-object p0
.end method

.method public getShowMotionSpec()Lzx2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->J:Le51;

    .line 2
    .line 3
    iget-object p0, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-object p0
.end method

.method public getShrinkMotionSpec()Lzx2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 2
    .line 3
    iget-object p0, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/material/button/MaterialButton;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/android/material/button/MaterialButton;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 26
    .line 27
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 28
    .line 29
    invoke-virtual {p0}, Lc51;->g()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public setAnimateShowBeforeLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->R:Z

    .line 2
    .line 3
    return-void
.end method

.method public setExtendMotionSpec(Lzx2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->I:Lc51;

    .line 2
    .line 3
    iput-object p1, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-void
.end method

.method public setExtendMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lzx2;->b(Landroid/content/Context;I)Lzx2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setExtendMotionSpec(Lzx2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setExtended(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->I:Lc51;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0}, Lc51;->h()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    :goto_1
    return-void

    .line 20
    :cond_2
    invoke-virtual {p0}, Lc51;->g()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setHideMotionSpec(Lzx2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->K:Ld51;

    .line 2
    .line 3
    iput-object p1, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-void
.end method

.method public setHideMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lzx2;->b(Landroid/content/Context;I)Lzx2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setHideMotionSpec(Lzx2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->Q:Z

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->M:I

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->N:I

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final setPaddingRelative(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 2
    .line 3
    .line 4
    iget-boolean p2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->P:Z

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iget-boolean p2, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->Q:Z

    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->M:I

    .line 13
    .line 14
    iput p3, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->N:I

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setShowMotionSpec(Lzx2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->J:Le51;

    .line 2
    .line 3
    iput-object p1, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-void
.end method

.method public setShowMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lzx2;->b(Landroid/content/Context;I)Lzx2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setShowMotionSpec(Lzx2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setShrinkMotionSpec(Lzx2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->H:Lc51;

    .line 2
    .line 3
    iput-object p1, p0, Ldq;->f:Lzx2;

    .line 4
    .line 5
    return-void
.end method

.method public setShrinkMotionSpecResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lzx2;->b(Landroid/content/Context;I)Lzx2;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->setShrinkMotionSpec(Lzx2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTextColor(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->S:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 11
    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 12
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;->S:Landroid/content/res/ColorStateList;

    return-void
.end method
